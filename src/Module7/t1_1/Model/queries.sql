use currencies;
select *
from currencies;

select *
from currencies
where abbreviation = 'EUR';

select count(*)
from currencies;
select max(conversionrate)
from currencies;