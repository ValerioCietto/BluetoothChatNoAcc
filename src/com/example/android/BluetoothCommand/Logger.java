package com.example.android.BluetoothCommand;

import java.util.ArrayList;

public class Logger {
	private ArrayList<String> moves;
	
	public Logger(){
		moves = new ArrayList<String>();
	}
	public void addMove(String s){
		moves.add(s);
	}
	public void remMove(){
		moves.remove(moves.size());
	}
	private void reverse(int i){
		String m = moves.get(i);
		if(m.equalsIgnoreCase("w")){
			moves.set(i, "s");
		}
		else if(m.equalsIgnoreCase("a")){
			moves.set(i, "d");
		}
		if(m.equalsIgnoreCase("s")){
			moves.set(i, "w");
		}
		if(m.equalsIgnoreCase("w")){
			moves.set(i, "s");
		}
	}
}
