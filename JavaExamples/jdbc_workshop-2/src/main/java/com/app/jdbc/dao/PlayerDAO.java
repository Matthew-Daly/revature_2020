package com.app.jdbc.dao;

import com.app.jdbc.excception.BuisnessException;
import com.app.jdbc.model.Player;

public interface PlayerDAO {

	public int createPlayer(Player player) throws BuisnessException;
	public int updatePlayerContact(int id, long newContact) throws BuisnessException;
	public void deletePlayer(int id) throws BuisnessException;
	public Player getPlayerById(int id) throws BuisnessException;
}	
