	package br.edu.ifsp.spo.projeto.utils;

public class Effort {
	private String effort;
	private Double[] especial = {-2.196998, -46.361899 ,-15.411580, -34.276938}; //minLon, minLat, maxLon, maxLat
	private Double[] normal = {-26.155681, -54.777426 , -34.016466, -46.603598};
	private Double[] especialB = {-19.766959, -52.997614, -23.966413 ,  -44.428305};



	public String getEffort(Double latitude, Double longitude) {

		if(Double.compare(especial[0], longitude) > 0 && Double.compare(especial[1], latitude) < 0 &&
				Double.compare(especial[2], longitude) < 0 && Double.compare(especial[3], latitude) >0)  {
			effort = "especial";
		}

		else if(Double.compare(especialB[0], longitude) > 0 && Double.compare(especialB[1], latitude) < 0 &&
				Double.compare(especialB[2], longitude) < 0 && Double.compare(especialB[3], latitude) >0)  {
			effort = "especial";
		}
		else if(Double.compare(normal[0], longitude) > 0 && Double.compare(normal[1], latitude) < 0 &&
				Double.compare(normal[2], longitude) < 0 && Double.compare(normal[3], latitude) >0)  {
			effort = "normal";
		}
		else
			effort= "trabalhoso";
			return effort;

	}

}
