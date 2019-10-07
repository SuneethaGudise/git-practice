package com.restBase;

import org.json.JSONObject;

public class ResponseBase {
	
		public int statuscode;
		public JSONObject obj;
		
		public ResponseBase() {
			
		}
		
		public int getStatuscode() {
			return statuscode;
			
		}
		public void setStatuscode(int code) {
			this.statuscode = code;
			
		}
		public JSONObject getJSONObject() {
			return obj;
			
		}
		public void setJSONObject(JSONObject jsob) {
			this.obj=jsob;
			
		}
		
		
	}


