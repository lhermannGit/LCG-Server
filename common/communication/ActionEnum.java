package communication;

public enum ActionEnum {
	WAITING_FOR_OPPONENT, // no params
	GAME_FOUND, // param1: playerName, param2: heroChoice
	GAME_LOSS, // no params
	GAME_WIN, // no params
	TURN_START, // no params
	TURN_END, // no params
	QUEUE_LEFT,
	SET_PLAYER_ID, // param1: ID

	CARD_DRAW,	// (optional)param1: card, param2: player
	
	PLAYER_DAMAGE, // param1: dmg, param2: player
	PLAYER_HEAL, // param1: heal, param2: player
	PLAYER_GAIN_ATTACK, // param1: value, param2: player
	PLAYER_STATUS_ADD, // param1: statusMask, param2: player
	PLAYER_STATUS_REMOVE, // param1: statusMask, param2: player
	
	ERROR_NO_MORE_ATTACKS,
	ERROR_CANNOT_ATTACK,
	ERROR_INVALID_TARGET,
	ERROR_NOT_YOUR_TURN,
	ERROR_NOT_ENOUGH_MANA,
	ERROR_ALREADY_USED,

	
	CREATURE_DAMAGE, // param1: dmg, param2: creature
	CREATURE_HEAL, // param1: heal, param2: creature
	CREATURE_GAIN_ATTACK,	// param1: value, param2: creature
	CREATURE_GAIN_MAXHEALTH, // param1: value, param2: creature
	CREATURE_STATUS_ADD, // param1: statusMask, param2: creature
	CREATURE_STATUS_REMOVE, // param1: statusMask, param2: creature
	CREATURE_DEATH, // param1: creature
}