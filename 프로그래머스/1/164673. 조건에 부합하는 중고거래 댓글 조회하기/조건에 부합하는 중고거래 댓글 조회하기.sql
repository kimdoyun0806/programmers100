SELECT U.TITLE, U.BOARD_ID, R.REPLY_ID, R.WRITER_ID, R.CONTENTS, DATE_FORMAT(R.CREATED_DATE, '%Y-%m-%d') AS 'CREATED_DATE'
FROM USED_GOODS_BOARD U
INNER JOIN USED_GOODS_REPLY R
ON U.BOARD_ID = R.BOARD_ID
WHERE U.CREATED_DATE BETWEEN '2022-10-01' AND '2022-10-31'
ORDER BY R.CREATED_DATE, U.TITLE;