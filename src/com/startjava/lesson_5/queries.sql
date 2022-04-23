-- выведите всю таблицу
select * from jaegers;
-- отобразите только не уничтоженных роботов
select * from jaegers where status = 'Active';
-- отобразите роботов нескольких серий, например Mark-1 и Mark-6
select * from jaegers where mark in ('Mark-1', 'Mark-5');
-- отсортируйте таблицу по убыванию по столбцу mark
select * from jaegers order by mark desc;
-- отобразите самого старого робота
select * from jaegers where launch = (select min(launch) from jaegers);
-- отобразите роботов, которые уничтожили больше/меньше всех kaiju
select * from jaegers where kaijuKill in ((select min(kaijuKill) from jaegers), (select max(kaijuKill) from jaegers));
-- отобразите средний вес роботов
select AVG(weight) from jaegers;
-- увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
update jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Active';
-- удалите уничтоженных роботов
delete from jaegers where status != 'Active';