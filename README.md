Aquí estarán las dos funciones de Oracle.

CREATE OR REPLACE FUNCTION n_ejemplo(n_sales NUMBER) RETURN VARCHAR2 IS n_commission NUMBER; BEGIN CASE WHEN n_sales > 200000 THEN n_commission := 0.2; WHEN n_sales >= 100000 AND n_sales < 200000 THEN n_commission := 0.15; WHEN n_sales >= 50000 AND n_sales < 100000 THEN n_commission := 0.1; WHEN n_sales >= 30000 THEN n_commission := 0.05; ELSE n_commission := 0; END CASE; RETURN 'Commission is ' || n_commission * 100 || '%'; END;

CREATE OR REPLACE FUNCTION asignar_ranking ( c_grade IN VARCHAR2 ) RETURN VARCHAR2 IS c_rank VARCHAR2(20); BEGIN CASE c_grade WHEN 'A' THEN c_rank := 'Excellent'; WHEN 'B' THEN c_rank := 'Very Good'; WHEN 'C' THEN c_rank := 'Good'; WHEN 'D' THEN c_rank := 'Fair'; WHEN 'F' THEN c_rank := 'Poor'; ELSE c_rank := 'No such grade'; END CASE; RETURN c_rank; END;
