import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserListComponent } from './user-list/user-list.component';
import { UserAddComponent } from './user-add/user-add.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { AppModule } from 'src/app/app.module';

@NgModule({
    declarations: [
        UserListComponent,
        UserAddComponent
    ],
    imports: [
        CommonModule,
        FormsModule,
        AppModule,
        RouterModule
    ],
    exports: [
        UserListComponent
    ]
})
export class UserModule { }