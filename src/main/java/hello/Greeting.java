package hello;

import java.lang.StringBuilder;

public class Greeting{
	private final long id;
	private final String name;

	public Greeting(long id, String name){
		this.id = id;
		this.name = name;
	}

	public long getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}

	@Override
	public String toString(){
		StringBuilder buff = new StringBuilder();
		buff.append("Greeting{id:").append(id).append(", name:").append(name).append("}"); 
		return buff.toString();
	}
}