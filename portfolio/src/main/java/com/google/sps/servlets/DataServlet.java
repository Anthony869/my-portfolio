// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/** Servlet that returns some example content. TODO: modify this file to handle comments data */
@WebServlet("/data")
public class DataServlet extends HttpServlet {

  @Override

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
      ArrayList<String> comments = new ArrayList<String>();
      comments.add("This page looks great");
      comments.add("nice job");
      comments.add("perfect");
        String json = "{";
          json += "\"commentOne\": ";
          json += "\"" + comments.get(0) + "\"";
          json += ", ";
          json += "\"commentTwo\": ";
          json += "\"" + comments.get(1) + "\"";      
          json += ", ";
          json += "\"commentThree\": ";
          json += "\"" + comments.get(2) + "\""; 
          json += "}";
    response.setContentType("application/json;");
    response.getWriter().println(json);
//   Gson gson = new Gson();
//   response.getWriter().println(gson.toJson(messages));
  }
/*  private String convertToJson(ArrayList m) {
        String json = "{";
          json += "\"greetingOne\": ";
          json += "\"" + m.get(0) + "\"";
          json += ", ";
          json += "\"greetingTwo\": ";
          json += "\"" + m.get(1) + "\"";      
          json += ", ";
          json += "\"greetingThree\": ";
          json += "\"" + m.get(2) + "\""; 
          json += "}";
    return json;
  }*/
}
