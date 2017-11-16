import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PersonListComponent } from './person-list/person-list.component';
import { PersonSearchComponent } from './person-search/person-search.component';
import { FormsModule } from '@angular/forms'

@NgModule({
  imports: [
    CommonModule,FormsModule
  ],
  declarations: [PersonListComponent, PersonSearchComponent]
})
export class PersonModule { }
