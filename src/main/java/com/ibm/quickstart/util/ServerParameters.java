package com.ibm.quickstart.util;

import javax.validation.Valid;
import io.dropwizard.Configuration;

public class ServerParameters {
	@Valid
	private String db2dbname;
	@Valid
	private String db2user;
	@Valid
	private String db2pass;
	@Valid
	private String db2host;
	@Valid
	private String db2schema;
	
	public String getDb2schema() {
		return db2schema;
	}
	public void setDb2schema(String db2schema) {
		this.db2schema = db2schema;
	}
	public String getDb2dbname() {
		return db2dbname;
	}
	public void setDb2dbname(String db2dbname) {
		this.db2dbname = db2dbname;
	}
	public String getDb2user() {
		return db2user;
	}
	public void setDb2user(String db2user) {
		this.db2user = db2user;
	}
	public String getDb2pass() {
		return db2pass;
	}
	public void setDb2pass(String db2pass) {
		this.db2pass = db2pass;
	}
	public String getDb2host() {
		return db2host;
	}
	public void setDb2host(String db2host) {
		this.db2host = db2host;
	}

}
