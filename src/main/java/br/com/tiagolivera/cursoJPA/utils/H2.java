package br.com.tiagolivera.cursoJPA.utils;

import java.sql.SQLException;

import org.h2.tools.Server;

public class H2 {
	
	public static void startDatabase() throws SQLException {
        new Server().runTool("-tcp", "-web", "-ifNotExists");
    }

}
