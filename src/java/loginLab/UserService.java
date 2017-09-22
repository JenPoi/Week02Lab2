/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginLab;

/**
 *
 * @author 617702
 */
public class UserService
{
    public UserService()
            {
                
            }
    boolean login(String username, String password)
    {
        if(password.equalsIgnoreCase("password") )
                {
                    if (username.equalsIgnoreCase("adam") || username.equalsIgnoreCase("betty"))
                            {
                                return true;
                            }
                }
            
        return false;
    }
}
