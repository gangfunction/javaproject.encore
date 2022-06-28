package dao.admin;

import dao.admin.*;

import java.awt.*;
import java.sql.SQLException;
import java.util.Scanner;

public class adminMenuSelect {
    protected adminMenuSelect() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("실행하실 기능을 선택하세요");
        int select = sc.nextInt();
        switch(select){
            case 1 -> {
                new adminMemberList();
            }
            case 2 -> {
                new adminMemberEdit();

            }
            case 3 -> {
                new adminMemberDelete();
            }
            case 4 -> {
                new adminMovieList();
            }
            case 5 -> {
                new adminMovieEdit();
            }
            case 6 -> {
                new adminMovieDelete();
            }
            case 7 -> {
                new Menu();
            }

        }

    }

}
