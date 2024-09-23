SELECT EMPLOYEE_ID
     , FIRST_NAME || ' ' || LAST_NAME
     , SALARY "급여"
     , JOB_ID "업무"
     , HIRE_DATE "입사일"
     , MANAGER_ID "상사의 사원번호"
  FROM EMPLOYEES;