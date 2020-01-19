package gestionare;

import java.sql.*;
import java.util.Scanner;

public class Profesor {
	public static short codMatricol;
	public static int nrCI;
	public static long CNP;
	public static String nume, initialaTata, preN, cetatenie, locNastere, adresa, serieCI, sex, materiiPredate, mentiuni;
	public static boolean director, directorAdjunct, diriginte, suplinitor;
	private static Scanner sc;
	
	public Profesor() {
		Profesor.codMatricol = 0;
		Profesor.nrCI = 0;
		Profesor.CNP = 0L;
		Profesor.nume = null;
		Profesor.initialaTata = null;
		Profesor.preN = null;
		Profesor.cetatenie = null;
		Profesor.locNastere = null;
		Profesor.adresa = null;
		Profesor.serieCI = null;
		Profesor.sex = null;
		Profesor.materiiPredate = null;
		Profesor.mentiuni = null;
		Profesor.director = false;
		Profesor.directorAdjunct = false;
		Profesor.diriginte = true;
		Profesor.suplinitor = false;
	}
	
	public Profesor(short cM,
					int nrCI,
					long CNP,
					String n, String inT, String preN, String c, String lN, String adr, String sCI, String s, String mPr, String m,
					boolean d, boolean dAdj, boolean dirig, boolean supl)
	{
		Profesor.codMatricol = cM;
		Profesor.nrCI = nrCI;
		Profesor.CNP = CNP;
		Profesor.nume = n;
		Profesor.initialaTata = inT;
		Profesor.preN = preN;
		Profesor.cetatenie = c;
		Profesor.locNastere = lN;
		Profesor.adresa = adr;
		Profesor.serieCI = sCI;
		Profesor.sex = s;
		Profesor.materiiPredate = mPr;
		Profesor.mentiuni = m;
		Profesor.director = d;
		Profesor.directorAdjunct = dAdj;
		Profesor.diriginte = dirig;
		Profesor.suplinitor = supl;
	}
	
	/*public String toString() {
		return "	Detalii PROFESOR:\n\nCodul matricol: " + codMatricol +
			   "\nNume, initiala tatalui si prenume: " + nume + " " + initialaTata + " " + preN +
			   "\nCNP: " + CNP +
			   "\nCetatenie: " + cetatenie +
			   "\nLocul de nastere: " + locNastere +
			   "\nAdresa: " + adresa +
			   "\nSeria cartii de identitate: " + serieCI +
			   "\nNumarul cartii de identitate: " + nrCI +
			   "\nSex: " + sex +
			   "\nMaterii predate: " + materiiPredate +
			   "\nMentiuni: " + mentiuni +
			   "\nDirector: " + director +
			   "\nDirector adjunct: " + directorAdjunct +
			   "\nDiriginte: " + diriginte +
			   "\nSuplinitor: " + suplinitor;
	}*/
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		try {
			System.out.println("	COMPLETATI FISA PROFESORULUI!\n");
		
			System.out.println("Codul matricol:");
			codMatricol = sc.nextShort();
		
			System.out.println("Nume:");
			nume = sc.next();
		
			System.out.println("Initiala tatalui:");
			initialaTata = sc.next();
		
			System.out.println("Prenume:");
			preN = sc.next();
		
			System.out.println("CNP:");
			CNP = sc.nextLong();
		
			System.out.println("Cetatenie:");
			cetatenie = sc.next();
		
			System.out.println("Locul nasterii:");
			locNastere = sc.next();
		
			System.out.println("Adresa:");
			adresa = sc.next();
		
			System.out.println("Seria cartii de identitate:");
			serieCI = sc.next();
		
			System.out.println("Numarul cartii de identitate:");
			nrCI = sc.nextInt();
		
			System.out.println("Sex:");
			sex = sc.next();
		
			System.out.println("Materii predate:");
			materiiPredate = sc.next();

			System.out.println("Mentiuni:");
			mentiuni = sc.next();
			
			System.out.println("Director:");
			director = sc.nextBoolean();
			
			System.out.println("Director adjunct:");
			directorAdjunct = sc.nextBoolean();
			
			System.out.println("Diriginte:");
			diriginte = sc.nextBoolean();
			
			System.out.println("Suplinitor:");
			suplinitor = sc.nextBoolean();
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/cnva", "dbuser", "dbpassword");
			PreparedStatement prSt = conexiune.prepareStatement("INSERT INTO profesori" +
						"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			prSt.setInt(1, codMatricol);
			prSt.setString(2, nume);
			prSt.setString(3, initialaTata);
			prSt.setString(4, preN);
			prSt.setLong(5, CNP);
			prSt.setString(6, cetatenie);
			prSt.setString(7, locNastere);
			prSt.setString(8, adresa);
			prSt.setString(9, serieCI);
			prSt.setInt(10, nrCI);
			prSt.setString(11, sex);
			prSt.setString(12, materiiPredate);
			prSt.setString(13, mentiuni);
			prSt.setBoolean(14, director);
			prSt.setBoolean(15, directorAdjunct);
			prSt.setBoolean(16, diriginte);
			prSt.setBoolean(17, suplinitor);
			
			int i = prSt.executeUpdate();
			if (i != 0) {
				System.out.println("Adaugare reusita!");
			} else {
				System.out.println("Adaugare NEreusita!!!");
			}
		} catch(Exception exc) {
			System.out.println(exc);
		}
	}
}
