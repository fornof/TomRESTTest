/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;


@Path("/myresource")
public class MyResource {
 @Context
    SecurityContext securityContext;
    
   @RolesAllowed({"admin"})
    //@PermitAll
    //@DenyAll
   @Path("/admin")
    @GET
    public String getAdmin() { return "GET This Admin"; }
 
    @RolesAllowed({"robert"})
    @Path("/robert")
    
    @GET
    public String getRobert() { return "GET This Robert "; }
    //@RolesAllowed("admin")
    @POST
    public String post(String content) { return content; }
 
//    @Path("sub")
//    public SubResource getSubResource() {
//        return new SubResource();
//    }
}