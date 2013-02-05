package com.fjxokt.lolclient.lolrtmps.events;

public enum ClientEventType {
	LOGIN_NEW_SUMMONER, LOGGED_IN, LOGGED_OUT, GAME_CLIENT_CONNECTED_TO_SERVER, GAME_IN_PROGRESS, END_OF_GAME_STATS,
	JOINING_MATCHMAKING, MATCHMAKING_UPDATE, SEARCHING_FOR_MATCH,
	JOINING_TEAM_SELECT, TEAM_SELECT_UPDATE, LEAVING_TEAM_SELECT, BANNED_FROM_GAME,
	JOINING_CHAMP_SELECT, CHAMP_SELECT_UPDATE, TRADE_CHAMP_REQUEST, TRADE_CHAMP_CANCEL, TRADE_CHAMP_NOT_ALLOWED,
	RETURNING_TEAM_SELECT, LEAVING_CHAMP_SELECT,
	RETURNING_LOBBY, LOCK_CHAMPION, JOINING_POST_CHAMPION_SELECT, POST_CHAMPION_SELECT,
	BALANCE_NOTIF;
}
