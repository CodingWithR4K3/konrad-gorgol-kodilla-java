DROP TABLE IF EXISTS STATS;
DROP VIEW IF EXISTS STATS;
DROP VIEW IF EXISTS BESTSELLERS_COUNT;
DROP EVENT IF EXISTS UPDATE_STAT;

CREATE TABLE STATS
(
    STAT_ID   INT(11)     NOT NULL AUTO_INCREMENT,
    STAT_DATE DATETIME    NOT NULL,
    STAT      VARCHAR(20) NOT NULL,
    VALUE     INT(11)     NOT NULL,
    PRIMARY KEY (STAT_ID)
);

CREATE VIEW BESTSELLERS_COUNT AS
SELECT COUNT(BESTSELLER) AS BESTSELLERS_COUNT
FROM BOOKS
WHERE BESTSELLER = 1;

DELIMITER $$

CREATE EVENT UPDATE_STAT ON SCHEDULE EVERY 1 MINUTE DO BEGIN
    CALL UpdateBestsellers();
    INSERT INTO STATS(STAT_DATE, STAT, VALUE)
    SELECT CURDATE(), 'BESTSELLERS', BESTSELLERS_COUNT
    FROM BESTSELLERS_COUNT;
END $$

DELIMITER ;