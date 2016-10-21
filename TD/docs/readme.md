#TD (Tower Defense)
	A tower defense game

##Game Screens
	- Login
		Allow player to login, reset login information, or quit
	- Main Menu
		Allow the player to log out, quit, play game (different scenarios available), access options, and access account information screens.
	- Game
		Allow player access to option, quit, and Game Play section
	- Options
		**To be decided**
	- Account
		Allows players to view and update their account information
	- Credits

##Game Play
	- Game Setup
		* Choose base ability
		* Initial credits allocated to player
	- Round
		* Rounds consist of three parts
			* Pre-Wave - Towers/Upgrades may be purchase with credits
			* Wave - Enemies attempt to destroy the Base. Towers attack enemies within range. Player may only use the base ability, pause, or forfeit the game.
			* Post-Wave - Credits are award to the player as the score. Credits accumulate over the course of the game
	- Game Over
	 	* Final Score composition
	 		* Score Increases
	 			* Credits > 0
	 			* Base Health = 100
	 		* Score Decreases
	 			* Credits < 0
	 			* Base Health < 100

##Units

	- Base
		* Health
		* A single use ability that can be chosen by the player during the setup phase
	- Towers
		* Damage
		* Damage Type
		* Attack Speed
		* Range
		* Cost
		* Upgrade Slots(1-3)
	- Enemies
		* Health
		* Resistances (Against specific attack types)
		* Weaknesses (Against specific attack types) 
		* Movement Type
		* Movement Speed
		* Damage
		* Attack Speed
		* Attack Type (To Implement Later)
	- Tower Upgrade
		* Benefit (Additional Damage Type, Range Adjustment, Attack Speed Adjustment, etc.)
		* Cost 
		
##Map
	* Base Location
		This is where the base resides
	* Path to Base
		This is the path the (most)enemies follow to get to the base.
	* Tower Placement Zones
		These are the areas that towers may be placed upon.		