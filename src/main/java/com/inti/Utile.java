package com.inti;

import java.util.List;

public class Utile {

	public double calculMoyenne(List<Double> listeSalaire) throws Exception
	{
		if (listeSalaire != null) {
			if (listeSalaire.size() != 0)
			{
			double somme = 0;
			
			for (Double salaire : listeSalaire) {
				somme += salaire;
			}
			
			return somme / listeSalaire.size(); 
			}

			else
			{
				throw new Exception();
			}
		}
		else
			throw new Exception();
	}
	
}
