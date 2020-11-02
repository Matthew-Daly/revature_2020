package com.app.jdbc;

import com.app.jdbc.dao.PlayerDAO;
import com.app.jdbc.dao.impl.PlayerDAOimpl;
import com.app.jdbc.exception.BusinessException;
import com.app.jdbc.model.Player;

public class JDBCWorkShop3Main {

	public static void main(String[] args) {
		
		Player player= new Player(106, "Me", "The Greatest", 5164768, "M", 48);
		
		PlayerDAO playerDAO= new PlayerDAOimpl();
		
		try {
			if(playerDAO.createPlayer(player)>0) {
				System.out.println("Player created in DataBase");
				System.out.println(player);
				
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
			

	}

}
