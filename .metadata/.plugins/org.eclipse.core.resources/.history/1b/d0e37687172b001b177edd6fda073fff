package pt.victoria.hub.b2c.ScarService;

public class ScarServiceProxy implements pt.victoria.hub.b2c.ScarService.ScarService {
  private String _endpoint = null;
  private pt.victoria.hub.b2c.ScarService.ScarService scarService = null;
  
  public ScarServiceProxy() {
    _initScarServiceProxy();
  }
  
  public ScarServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initScarServiceProxy();
  }
  
  private void _initScarServiceProxy() {
    try {
      scarService = (new pt.victoria.hub.b2c.ScarService.ScarServiceServiceLocator()).getScarServicePort();
      if (scarService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)scarService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)scarService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (scarService != null)
      ((javax.xml.rpc.Stub)scarService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pt.victoria.hub.b2c.ScarService.ScarService getScarService() {
    if (scarService == null)
      _initScarServiceProxy();
    return scarService;
  }
  
  public pt.victoria.hub.b2c.ScarService.ChangePasswordResponse changePassword(pt.victoria.hub.b2c.ScarService.ChangePasswordRequest changePasswordRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.changePassword(changePasswordRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.ValidateCreateClientUserResponse validateCreateClientUser(pt.victoria.hub.b2c.ScarService.ValidateCreateClientUserRequest validateCreateClientUserRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.validateCreateClientUser(validateCreateClientUserRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.GetActionsByUserResponse getActionsByUser(pt.victoria.hub.b2c.ScarService.GetActionsByUserRequest getActionsByUserRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.getActionsByUser(getActionsByUserRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.ApplyTokenResponse applyToken(pt.victoria.hub.b2c.ScarService.ApplyTokenRequest applyTokenRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.applyToken(applyTokenRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.RecoverPasswordResponse recoverPassword(pt.victoria.hub.b2c.ScarService.RecoverPasswordRequest recoverPasswordRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.recoverPassword(recoverPasswordRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.GetUsersResponse getUsers(pt.victoria.hub.b2c.ScarService.GetUsersRequest getUsersRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.getUsers(getUsersRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.LogoutUserResponse logoutUser(pt.victoria.hub.b2c.ScarService.LogoutUserRequest logoutUserRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.logoutUser(logoutUserRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.ValidateAuthenticationKeyResponse validateAuthenticationKey(pt.victoria.hub.b2c.ScarService.ValidateAuthenticationKeyRequest validateAuthenticationKeyRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.validateAuthenticationKey(validateAuthenticationKeyRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.CreateUserResponse createUser(pt.victoria.hub.b2c.ScarService.CreateUserRequest createUserRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.createUser(createUserRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.ConcludeCreateClientUserResponse concludeCreateClientUser(pt.victoria.hub.b2c.ScarService.ConcludeCreateClientUserRequest concludeCreateClientUserRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.concludeCreateClientUser(concludeCreateClientUserRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.LoginResponse login(pt.victoria.hub.b2c.ScarService.LoginRequest loginRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.login(loginRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.SendAuthenticationKeyResponse sendAuthenticationKey(pt.victoria.hub.b2c.ScarService.SendAuthenticationKeyRequest sendAuthenticationKeyRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.sendAuthenticationKey(sendAuthenticationKeyRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.SignupAllowedResponse signupAllowed(pt.victoria.hub.b2c.ScarService.SignupAllowedRequest signupAllowedRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.signupAllowed(signupAllowedRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.ValidateUserTokenResponse validateUserToken(pt.victoria.hub.b2c.ScarService.ValidateUserTokenRequest validateUserTokenRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.validateUserToken(validateUserTokenRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.ApplyChangeRequestRecoverPasswordResponse applyChangeRequestRecoverPassword(pt.victoria.hub.b2c.ScarService.ApplyChangeRequestRecoverPasswordRequest applyChangeRequestRecoverPasswordRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.applyChangeRequestRecoverPassword(applyChangeRequestRecoverPasswordRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.GetUserResponse getUser(pt.victoria.hub.b2c.ScarService.GetUserRequest getUserRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.getUser(getUserRequest);
  }
  
  public pt.victoria.hub.b2c.ScarService.UpdateUserResponse updateUser(pt.victoria.hub.b2c.ScarService.UpdateUserRequest updateUserRequest) throws java.rmi.RemoteException{
    if (scarService == null)
      _initScarServiceProxy();
    return scarService.updateUser(updateUserRequest);
  }
  
  
}