SELECT p.Name, s.Sport , s.Total_Score from players as p
left join scores as s on p.Player_no = s.Player_no
