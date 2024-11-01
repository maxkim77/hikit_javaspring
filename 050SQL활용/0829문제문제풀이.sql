

DESC EMP;

SELECT *
  FROM EMP;

-- 4-1

SELECT ENAME  "사원이름"
     , JOB    "사원직위"
  FROM EMP;

-- 4-2

SELECT ENAME
     , SAL
  FROM EMP
 WHERE DEPTNO = 30;

--4-3

SELECT EMPNO
     , SAL
     , SAL * 1.1      "인상된급여"
     , SAL * 0.1      "증가액"
  FROM EMP
 ORDER BY 1;

--4-4

SELECT *
  FROM EMP
 WHERE ENAME LIKE 'S%';

--4-5

SELECT MAX(SAL)
     , MIN(SAL)
     , SUM(SAL)
     , ROUND(AVG(NVL(SAL, 0)), 0)
  FROM EMP;

--4-6
SELECT COUNT(EMPNO)
     , JOB
  FROM EMP
 GROUP BY JOB;

--4-7

SELECT MAX(SAL) - MIN(SAL)
  FROM EMP;

--4-8

SELECT COUNT(EMPNO)
     , SUM(SAL)
     , AVG(NVL(SAL,0))
  FROM EMP
 WHERE DEPTNO = 30;

--4-9
SELECT DEPTNO FROM EMP WHERE SAL = (SELECT MAX(SAL) FROM EMP);

--4-10
SELECT *
  FROM TAB;
SELECT * FROM EMP;

SELECT JOB
     , AVG(NVL(SAL, 0))
  FROM EMP
  WHERE JOB <>'SALESMAN'
 GROUP BY JOB
HAVING AVG(NVL(SAL, 0)) >= 3000;

SELECT JOB
     , AVG(NVL(SAL, 0))
  FROM EMP
 WHERE JOB <> 'SALESMAN'
 GROUP BY JOB
HAVING AVG(NVL(SAL, 0)) >= 3000
 ORDER BY AVG(NVL(SAL, 0)) DESC;

--   WHERE JOB <>'SALESMAN' W주의
--4-11

SELECT COUNT(ENAME)
  FROM EMP
 WHERE MGR IS NOT NULL;
 

--4-12

SELECT * FROM EMP;
SELECT ENAME "이름", SAL "급여", COMM "커미션금액", SAL+COMM "총액"
FROM EMP 
WHERE COMM IS NOT NULL
ORDER BY 2 DESC;



--4-13
SELECT DEPTNO  "부서번호"
     , JOB     "업무명"
     , COUNT(DEPTNO) "인원수"
  FROM EMP
 GROUP BY DEPTNO, JOB ORDER BY 1, 2;
 
 --4-14

DESC EMP;

 
 SELECT * FROM EMP;
 SELECT * FROM DEPT;
 
 SELECT DNAME
  FROM DEPT
 WHERE NOT EXISTS (
    SELECT *
      FROM EMP
     WHERE EMP.DEPTNO = DEPT.DEPTNO
);

 SELECT DNAME
  FROM DEPT
 WHERE DEPT.DEPTNO NOT IN (
    SELECT DISTINCT DEPTNO
      FROM EMP
);
 
 
--4-15
SELECT JOB
     , COUNT(EMPNO)
  FROM EMP
 GROUP BY JOB
HAVING COUNT(JOB) >= 4;

--4-16
SELECT ENAME
  FROM EMP
 WHERE EMPNO >= 7400 AND EMPNO <= 7600;

--4-17
SELECT ENAME
     , DEPT.DNAME
  FROM EMP
     , DEPT
 WHERE EMP.DEPTNO = DEPT.DEPTNO; 
 
 --4-18
SELECT * FROM TAB;

SELECT * FROM EMP;

SELECT ENAME "사원"
     , (
    SELECT ENAME
      FROM EMP E1
     WHERE E2.MGR = E1.EMPNO
) "팀장"
  FROM EMP E2; 

-- 강사답
SELECT E1.ENAME
      ,E2.ENAME
      FROM EMP E1
      ,EMP E2
      WHERE E1.EMPNO=E2.MGR;
  
DESC EMP;

SELECT * FROM EMP WHERE ENAME='SCOTT';
--4-19
INSERT INTO EMP VALUES
(7788,'SCOTT','ANALYST',7566,to_date('13-07-02','dd-mm-yyyy'),3000,NULL,20);
INSERT INTO EMP VALUES
(7876,'ADAMS','CLERK',7788,to_date('13-06-01','dd-mm-yyyy'),1100,NULL,20);
COMMIT;

DELETE FROM EMP WHERE EMPNO=7788;
DELETE FROM EMP WHERE EMPNO=7876;

SELECT ENAME
  FROM EMP
 WHERE SAL > (
    SELECT SAL
      FROM EMP
     WHERE ENAME = 'SCOTT'
);
SELECT * FROM EMP;
SELECT * FROM DEPT;


--4-20
SELECT DEPTNO FROM EMP WHERE ENAME='SCOTT'
UNION
SELECT DEPTNO FROM DEPT WHERE LOC='DALLAS';

SELECT DISTINCT(DEPT.DEPTNO)
  FROM EMP
     , DEPT
 WHERE DEPT.DEPTNO = EMP.DEPTNO 
 AND ENAME  = 'SCOTT' OR LOC     = 'DALLAS';
 
 -- A-1
 
 

 
 
 
 -- 행 