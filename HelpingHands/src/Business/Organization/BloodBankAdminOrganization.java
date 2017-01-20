/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.BloodBankAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BloodBankAdminOrganization extends Organization{

    public BloodBankAdminOrganization() {
        super(Organization.Type.BloodBankAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new BloodBankAdminRole());
        return roles;
    }
     
}
