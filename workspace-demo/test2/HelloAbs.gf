abstract HelloAbs = {

	flags startcat = Greeting ;
	
	cat Recipient ; Greeting ; Farewell ;
	
	fun 
		Hello : Recipient -> Greeting ;
		Goodbye : Recipient -> Farewell ;
		World, Parent, Friends : Recipient ;

}
