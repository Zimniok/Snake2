package main;

public class Player {
	public static Segment segments[];
	static void init(Segment segment){
		if(segments[0]==null){
			segment.ID = 0;
		}else{
			segment.ID = segments.length;
		}
		if(segments.length == 0 || segments[0]==null){
			segment.posX = Head.getlastposX();
			segment.posY = Head.getlastposY();
		}else{
			segment.posX = segments[segment.ID-1].posX;
			segment.posY = segments[segment.ID-1].posY;
		}
		segments[segments.length] = segment;
	}
}
