-- Write your PostgreSQL query statement below
-- 30000 доллараас бага цалинтай, менежер нь компаниас гарсан ажилчдын үнэмлэхийг олоорой. Менежер компанийг орхих үед тэдний мэдээлэл Ажилчдын хүснэгтээс устах боловч тайлангууд нь менежерийн_id-г орхисон менежерт тохируулсан хэвээр байна. ажилтан_id-ээр захиалсан үр дүнгийн хүснэгтийг буцаана уу.

select employee_id 
from Employees 
where salary < 30000 and manager_id not in (
    select s.employee_id
    from Employees s
)
order by employee_id asc
