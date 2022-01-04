class CarDetailsTester{

public static void main(String []args){
		CarDetails.listenMusic();
		String songName="your choice";
		CarDetails.listenMusic(songName);
		int num=10;
		String list="kannda";
		CarDetails.listenMusic(num,list);
		String listz="New song";
		double digit=1.2;
		CarDetails.listenMusic(list,num);
		System.out.println();
		
		CarDetails.driving();
		String drive="Go...slow..limit your speed less than 50 !!!!";
		CarDetails.driving(drive);
		int limitspeed=80;
		String name="Don't drink and drive";
		CarDetails.driving(limitspeed,name);
		String message="Amazing driving";
		int number=100;
		CarDetails.driving(name,number);
		System.out.println();
		
		CarDetails.stunt();
		String type="round wheeling";
		CarDetails.stunt(type);
		int a=10;
		int b=20;
		CarDetails.stunt(a,b);
		String namer="";
		int nums=33;
		CarDetails.stunt(namer,nums);
		
		CarDetails.sleeping();
		String comfort="It has inside the AC we can sleep comfortably";
		CarDetails.sleeping(comfort);
		boolean IsEnjoy=true;
		String names="";
		CarDetails.sleeping(IsEnjoy,names);
		CarDetails.sleeping();
		System.out.println();
		
		CarDetails.travelling();
		String addicted="Travelling is the healthiest addiction";
		CarDetails.travelling(addicted);
		String nam="";
		int numberss=5;
		CarDetails.travelling(nam,numberss);
		int numss=7;
		String namez="";
		CarDetails.travelling(numss,namez);
	}
}