-- 코드를 작성해주세요
select f.ITEM_ID, f.ITEM_NAME, f.RARITY
from ITEM_INFO f, ITEM_TREE t
where f.ITEM_ID = t.ITEM_ID and t.PARENT_ITEM_ID in ( select ITEM_ID from ITEM_INFO where RARITY = 'RARE') 
order by f.ITEM_ID desc;