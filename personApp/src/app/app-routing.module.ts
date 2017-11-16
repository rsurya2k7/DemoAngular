import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PersonListComponent } from './person/person-list/person-list.component';

const routes: Routes = [
  {path: '', children: []},
  {path:'person', component:PersonListComponent} ,
  {path:'person/:name',component:PersonListComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
