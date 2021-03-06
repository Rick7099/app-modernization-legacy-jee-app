/*
 * Copyright IBM Corp. 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package wasdev.sample;

/**
 * Represents a Visitor document stored in Cloudant.
 */

public class Visitor {

	private String name = null;
	private int id;
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Visitor() {
		this.name = "";
	}

	
	
	/**
	 * Gets the visitorName of the document.
	 * 
	 * @return The name of the document.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name
	 * 
	 * @param name
	 *            The visitorName to set.
	 */
	public void setName(String visitorName) {
		this.name = visitorName;
	}

}