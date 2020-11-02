package com.app.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.jdbc.dao.PlayerDAO;
import com.app.jdbc.dbutil.PostresSqlConnection;
import com.app.jdbc.exception.BusinessException;
import com.app.jdbc.model.Player;

public class PlayerDAOimpl implements PlayerDAO {

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c = 0;
		try(Connection connection=PostresSqlConnection.getConnection()){
			String sql="INSERT INTO roc_revature.player(id, name, age, gender, teamname, contact) " +
					"VALUES(?, ?, ?, ?, ?, ?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setString(4, player.getGender());
			preparedStatement.setString(5, player.getTeamName());
			preparedStatement.setLong(6, player.getContact());
			
			c=preparedStatement.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //take out in production
			throw new BusinessException("Internal error. Please contact SYSAdmin");
		}
		return c;
	}

	@Override
	public int updatePlayerContact(int id, long newContact) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player getPlayerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
	