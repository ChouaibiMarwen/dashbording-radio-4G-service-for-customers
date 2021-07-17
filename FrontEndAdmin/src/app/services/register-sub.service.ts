import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { SubAdmin } from '../classes/sub-admin';

@Injectable({
  providedIn: 'root'
})
export class RegisterSubService {

  constructor(private http:HttpClient) { }

  public registerSub( subAdmin:SubAdmin):Observable<any>{
    return this.http.post<any>("http://localhost:8080/registerSub", subAdmin);

  }

  public getSubAdmins ():Observable<SubAdmin[]>{
    return this.http.get<SubAdmin[]>("http://localhost:8080/getSubAdmin")
  }

  public deleteSub (idSub : number){
    return this.http.delete("http://localhost:8080/deleteSubAdmin?idSub=" + idSub)
  }
  public updateSub (subAdmin){
      return this.http.put("http://localhost:8080/updateSubdmin", subAdmin)
  }
   public getOrangeSubAdinAccNumber( operator){
     return this.http.get("http://localhost:8080/orangNumber?operator=" +operator) 
   }
}
