package com.finaxys;

import com.finaxys.thread.Connexion;

public class MyMainSingleton {

	public static void main(String[] args) {
		new Thread( () -> Connexion.getInstance().open()).start();
        new Thread( () -> Connexion.getInstance().close()).start();
	}

}
