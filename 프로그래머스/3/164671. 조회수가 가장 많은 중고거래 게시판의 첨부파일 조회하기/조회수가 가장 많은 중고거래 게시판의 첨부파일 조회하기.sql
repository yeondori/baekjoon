-- 코드를 입력하세요
SELECT CONCAT('/home/grep/src/', BOARD_ID, '/', FILE_ID, FILE_NAME, FILE_EXT) FILE_PATH
FROM USED_GOODS_FILE
JOIN USED_GOODS_BOARD
USING (BOARD_ID)
WHERE BOARD_ID = (SELECT BOARD_ID FROM USED_GOODS_BOARD ORDER BY VIEWS desc LIMIT 1)
ORDER BY FILE_ID desc;