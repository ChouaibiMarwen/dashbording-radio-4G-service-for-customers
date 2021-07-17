import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Admin } from '../classes/admin';
import {HttpClient} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor( private _http : HttpClient) {}

  public LoginAdmin(admin : Admin):Observable<any>{
   return this._http.post<any>("http://localhost:8080/adminLogin", admin)
  }

  public AdRegistration( admin : Admin): Observable<any>{
    return this._http.post<any>("http://localhost:8080/adminRegister",admin);
  }

  private handleError(error: Response ) {
    console.error('NotificationService::handleError', error);
    return Observable.throw(error);
  }
}
