package gestionare;

import java.sql.*;
import java.util.Scanner;

public class Elev {
	public static byte loc;
	public static int nrMatricol, nrCI;
	public static long CNP;
	public static float medieAdmitere;
	public static String nume, initialaTata, preN, cetatenie, locNastere, adresa, serieCI, sex, profil, specializare, mentiuni;
	public static boolean bilingvEngleza;
	private static Scanner sc;
	
	public Elev() {
		Elev.loc = 0;
		Elev.nrMatricol = 0;
		Elev.nrCI = 0;
		Elev.CNP = 0L;
		Elev.medieAdmitere = 0.0f;
		Elev.nume = null;
		Elev.initialaTata = null;
		Elev.preN = null;
		Elev.cetatenie = null;
		Elev.locNastere = null;
		Elev.adresa = null;
		Elev.serieCI = null;
		Elev.sex = null;
		Elev.profil = null;
		Elev.specializare = null;
		Elev.mentiuni = null;
		Elev.bilingvEngleza = true;
	}
	
	public Elev(byte l,
				int nrM, int nrCI,
				long CNP,
				float mAdm,
				String n, String inT, String preN, String c, String lN, String adr, String sCI, String s, String pr, String sp, String m,
				boolean bEng)
	{
		Elev.loc = l;
		Elev.nrMatricol = nrM;
		Elev.nrCI = nrCI;
		Elev.CNP = CNP;
		Elev.medieAdmitere = mAdm;
		Elev.nume = n;
		Elev.initialaTata = inT;
		Elev.preN = preN;
		Elev.cetatenie = c;
		Elev.locNastere = lN;
		Elev.adresa = adr;
		Elev.serieCI = sCI;
		Elev.sex = s;
		Elev.profil = pr;
		Elev.specializare = sp;
		Elev.mentiuni = m;
		Elev.bilingvEngleza = bEng;
	}
	
	/*public String toString() {
		return "	Detalii ELEV:\n\nNumarul matricol: " + nrMatricol +
			   "\nNume, initiala tatalui si prenume: " + nume + " " + initialaTata + " " + preN +
			   "\nCNP: " + CNP +
			   "\nCetatenie: " + cetatenie +
			   "\nLocul de nastere: " + locNastere +
			   "\nAdresa: " + adresa +
			   "\nSeria cartii de identitate: " + serieCI +
			   "\nNumarul cartii de identitate: " + nrCI +
			   "\nSex: " + sex +
			   "\nLoc: " + loc +
			   "\nProfil: " + profil +
			   "\nSpecializare: " + specializare +
			   "\nBilingv engleza: " + bilingvEngleza +
			   "\nMedia de admitere: " + medieAdmitere +
			   "\nMentiuni: " + mentiuni;
	}*/
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		try {
			System.out.println("	COMPLETATI FISA ELEVULUI!\n");
		
			System.out.println("Numarul matricol:");
			nrMatricol = sc.nextInt();
		
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
		
			System.out.println("Loc:");
			loc = sc.nextByte();
		
			System.out.println("Profil:");
			profil = sc.next();
		
			System.out.println("Specializare:");
			specializare = sc.next();
		
			System.out.println("Bilingv engleza:");
			bilingvEngleza = sc.nextBoolean();
		
			System.out.println("Media de admitere:");
			medieAdmitere = sc.nextFloat();
		
			System.out.println("Mentiuni:");
			mentiuni = sc.next();
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/cnva", "dbuser", "dbpassword");
			PreparedStatement prSt = conexiune.prepareStatement("INSERT INTO admisi_2019" +
						"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			prSt.setInt(1, nrMatricol);
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
			prSt.setInt(12, loc);
			prSt.setString(13, profil);
			prSt.setString(14, specializare);
			prSt.setBoolean(15, bilingvEngleza);
			prSt.setFloat(16, medieAdmitere);
			prSt.setString(17, mentiuni);
			
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
