package objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather
{
	public int id, cod, visibility, dt;
	public String name, base;
	public Object weather, main, coord, wind, clouds, sys;
}