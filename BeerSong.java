public class BeerSong{
	public static void main(String[] args){
		Ninety_Nine_Bottles_of_Beer();
	}
	public static void Ninety_Nine_Bottles_of_Beer(){
		int i = 99;
		while(i > 0){
			System.out.println( i + "  bottles of beer on the wall, " + i + " bottles of beer");
			i--;
			if(i == 0){
				System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n\n");
			}else{
				System.out.println("takeone down, pass it around, " + i + " bottles of beer on the wall.\n\n");
			}
			try{
				Thread.sleep(1000);	
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.\n\n\n");
	}
}
