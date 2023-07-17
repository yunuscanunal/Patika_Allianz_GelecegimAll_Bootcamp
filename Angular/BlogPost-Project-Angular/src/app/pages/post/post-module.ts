import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PostListComponent } from './post-list/post-list.component';
import { PostAddComponent } from './post-add/post-add.component';

import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import { PostDetailedComponent } from './post-detailed/post-detailed.component';
import { AppModule } from 'src/app/app.module';

@NgModule({
    declarations: [
        PostListComponent,
        PostAddComponent,
        PostDetailedComponent
    ],
    imports: [
        CommonModule,
        FormsModule,
        RouterModule,
        AppModule

    ],
    exports: [
        PostListComponent
    ]
})
export class PostsModule { }