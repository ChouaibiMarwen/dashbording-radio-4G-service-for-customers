import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AlertsComponent } from './alerts/alerts.component';
import { HomeAdminComponent } from './home-admin/home-admin.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { ManageAccComponent } from './manage-acc/manage-acc.component';
import { ReclamationComponent } from './reclamation/reclamation.component';
import { RegistrationComponent } from './registration/registration.component';

const routes: Routes = [
  {path:'homeAdmin', component:HomeAdminComponent},
  {path:'', component:HomeAdminComponent, children: [
    {path:'home', component: HomeComponent},
    {path:'complaints', component: ReclamationComponent},
    {path:'accounts', component: ManageAccComponent},
    {path:'alerts', component: AlertsComponent},
    
  ]},
  
  {path:'registration', component:RegistrationComponent},
  {path:'login', component:LoginComponent},
 
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
