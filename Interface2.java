interface Poco{
	void view();
}
interface Loco extends Poco{
	void present();
}
class Coco implements Poco,Loco{
	public void view(){
		System.out.println("Poco interface.");
	}
	public void present(){
		System.out.println("Loco interface.");
	}
}
class Interface2{
	public static void main(String args []){
		Coco coc = new Coco();
		coc.view();
		coc.present();
	}
}
