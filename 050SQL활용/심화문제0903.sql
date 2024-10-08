--A-8
SELECT DISTINCT JOB_ID
  FROM EMPLOYEES;

SELECT *
  FROM EMPLOYEES;

SELECT EMPLOYEE_ID
     , CASE
    WHEN JOB_ID = 'HR_REP'
    THEN SALARY * 1.1
    WHEN JOB_ID = 'MK_REP'
    THEN SALARY * 1.12
    WHEN JOB_ID = 'PR_REP'
    THEN SALARY * 1.5
    WHEN JOB_ID = 'IT_PROG'
    THEN SALARY * 1.2
    ELSE SALARY
END AS SALARY
  FROM EMPLOYEES;

-- 강사답

SELECT EMPLOYEE_ID
     , CASE JOB_ID
    WHEN 'HR_REP'
    THEN SALARY * 1.1
    WHEN 'MK_REP'
    THEN SALARY * 1.12
    WHEN 'PR_REP'
    THEN SALARY * 1.5
    WHEN 'IT_PROG'
    THEN SALARY * 1.2
    ELSE SALARY
END AS SALARY
  FROM EMPLOYEES;

SELECT EMPLOYEE_ID
     , DECODE(JOB_ID, 'HR_REP', SALARY * 1.1, 'MK_REP', SALARY * 1.12
     , 'PR_REP', SALARY * 1.5, 'IT_PROG', SALARY * 1.2)
  FROM EMPLOYEES;
-- A-8-1

SELECT EMPLOYEE_ID
     , HIRE_DATE
     , CASE
    WHEN HIRE_DATE >= TO_DATE('2001', 'YYYY') AND HIRE_DATE < TO_DATE('2002', 'YYYY')
    THEN SALARY * 0.05
    WHEN HIRE_DATE >= TO_DATE('2002', 'YYYY') AND HIRE_DATE < TO_DATE('2003', 'YYYY')
    THEN SALARY * 0.03
    WHEN HIRE_DATE >= TO_DATE('2003', 'YYYY') AND HIRE_DATE < TO_DATE('2004', 'YYYY')
    THEN SALARY * 0.01
         END AS BONUS
  FROM EMPLOYEES
 WHERE HIRE_DATE >= TO_DATE('2001', 'YYYY') AND HIRE_DATE < TO_DATE('2004', 'YYYY')
 ORDER BY HIRE_DATE ASC;
 
 --A-8-2

SELECT DEPARTMENT_ID
     , SUM(SALARY)
     , CASE
    WHEN SUM(SALARY) > 100000
    THEN 'EXCELLENT'
    WHEN SUM(SALARY) > 50000
    THEN 'GOOD'
    WHEN SUM(SALARY) > 10000
    THEN 'MEDIUM'
    WHEN SUM(SALARY) <= 10000
    THEN 'WELL'
         END AS GRADE
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID;

--강사답

SELECT DEPARTMENT_ID
     , SUM_SAL
     , CASE
    WHEN SUM_SAL > 100000
    THEN 'EXCELLENT'
    WHEN SUM_SAL > 50000
    THEN 'GOOD'
    WHEN SUM_SAL > 10000
    THEN 'MEDIUM'
    ELSE 'WELL'
END AS GRADE
  FROM (
    SELECT DEPARTMENT_ID
         , SUM(SALARY) AS SUM_SAL
      FROM EMPLOYEES
     GROUP BY DEPARTMENT_ID
) DEPT_SUMMARY
 ORDER BY DEPARTMENT_ID;



--A-8-3

SELECT JOB_ID
  FROM EMPLOYEES;

SELECT EMPLOYEE_ID
     , CASE
    WHEN JOB_ID LIKE '%MGR' AND HIRE_DATE < TO_DATE('2005', 'YYYY')
    THEN SALARY * 1.15
    WHEN JOB_ID LIKE '%MAN'
    THEN SALARY * 1.2
    WHEN JOB_ID LIKE '%MGR' AND HIRE_DATE >= TO_DATE('2005', 'YYYY')
    THEN SALARY * 1.25
    ELSE SALARY
END AS SALARY
  FROM EMPLOYEES;
-- K강사답

SELECT EMPLOYEE_ID
     , CASE
    WHEN HIRE_DATE < TO_DATE('2005-01-01', 'YYYY-MM-DD')
    THEN
        CASE
            WHEN JOB_ID LIKE '%MGR'
            THEN SALARY * 1.15
            WHEN JOB_ID LIKE '%MAN'
            THEN SALARY * 1.20
            ELSE SALARY
        END
    ELSE
        CASE
            WHEN JOB_ID LIKE '%MGR'
            THEN SALARY * 1.15
            ELSE SALARY
        END
END "JOB SALARY"
  FROM EMPLOYEES
 WHERE JOB_ID LIKE '%MGR' OR JOB_ID LIKE '%MAN';

--A-8-4

SELECT SUM(
    CASE
        WHEN TO_CHAR(HIRE_DATE, 'MM') = '01'
        THEN 1
        ELSE 0
    END
)         AS JANUARY
     , SUM(
    CASE
        WHEN TO_CHAR(HIRE_DATE, 'MM') = '02'
        THEN 1
        ELSE 0
    END
)         AS FEBRUARY
     , SUM(
    CASE
        WHEN TO_CHAR(HIRE_DATE, 'MM') = '03'
        THEN 1
        ELSE 0
    END
)         AS MARCH
     , SUM(
    CASE
        WHEN TO_CHAR(HIRE_DATE, 'MM') = '04'
        THEN 1
        ELSE 0
    END
)         AS APRIL
     , SUM(
    CASE
        WHEN TO_CHAR(HIRE_DATE, 'MM') = '05'
        THEN 1
        ELSE 0
    END
)         AS MAY
     , SUM(
    CASE
        WHEN TO_CHAR(HIRE_DATE, 'MM') = '06'
        THEN 1
        ELSE 0
    END
)         AS JUNE
     , SUM(
    CASE
        WHEN TO_CHAR(HIRE_DATE, 'MM') = '07'
        THEN 1
        ELSE 0
    END
)         AS JULY
     , SUM(
    CASE
        WHEN TO_CHAR(HIRE_DATE, 'MM') = '08'
        THEN 1
        ELSE 0
    END
)         AS AUGUST
     , SUM(
    CASE
        WHEN TO_CHAR(HIRE_DATE, 'MM') = '09'
        THEN 1
        ELSE 0
    END
)         AS SEPTEMBER
     , SUM(
    CASE
        WHEN TO_CHAR(HIRE_DATE, 'MM') = '10'
        THEN 1
        ELSE 0
    END
)         AS OCTOBER
     , SUM(
    CASE
        WHEN TO_CHAR(HIRE_DATE, 'MM') = '11'
        THEN 1
        ELSE 0
    END
)         AS NOVEMBER
     , SUM(
    CASE
        WHEN TO_CHAR(HIRE_DATE, 'MM') = '12'
        THEN 1
        ELSE 0
    END
)         AS DECEMBER
  FROM EMPLOYEES;
-- 부서와 업무별 급여합계
-- 신년도 급여 수준 레벨
-- 부서번호와 업무를 기준으로
-- 급여합계 인우너수

SELECT DEPARTMENT_ID
     , JOB_ID
     , SUM(SALARY)
     , COUNT(EMPLOYEE_ID)
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID
        , JOB_ID
        ORDER BY DEPARTMENT_ID;

SELECT DEPARTMENT_ID
     , JOB_ID
     , SUM(SALARY)            AS TOTAL_SALARY
     , COUNT(EMPLOYEE_ID)     AS EMPLOYEE_COUNT
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID
        , JOB_ID
UNION ALL
SELECT DEPARTMENT_ID
     , '총계'                   AS JOB_ID
     , SUM(SALARY)            AS TOTAL_SALARY
     , COUNT(EMPLOYEE_ID)     AS EMPLOYEE_COUNT
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID
 ORDER BY DEPARTMENT_ID
        , JOB_ID;

SELECT DEPARTMENT_ID
     , JOB_ID
     , SUM(SALARY)            AS TOTAL_SALARY
     , COUNT(EMPLOYEE_ID)     AS EMPLOYEE_COUNT
  FROM EMPLOYEES
 GROUP BY ROLLUP(DEPARTMENT_ID
        , JOB_ID);
        
        
-- INDEX는 값이 쉽게 바뀌지 않은 것
-- 변별력이 10%로 남녀는 50%
SELECT NAME FROM CUSTOMER WHERE NAME = '박세리';

CREATE INDEX IDX_CUSTOMER_NAME ON CUSTOMER(NAME);

DROP INDEX IDX_CUSTOMER_NAME;
