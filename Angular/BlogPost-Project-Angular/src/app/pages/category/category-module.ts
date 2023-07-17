import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CategoryListComponent } from './category-list/category-list.component';
import { FormsModule } from '@angular/forms';

import { RouterModule } from '@angular/router';
import { AppModule } from 'src/app/app.module';
import { CategoryAddComponent } from './category-add/category-add.component';



@NgModule({
    declarations: [
        CategoryListComponent,
        CategoryAddComponent

    ],
    imports: [
        CommonModule,
        FormsModule,
        AppModule,
        RouterModule
    ]
})
export class CategoryModule { }