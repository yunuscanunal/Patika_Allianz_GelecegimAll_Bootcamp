import { Component } from '@angular/core';
import { Post } from '../post';
import { PostService } from '../post.service';
import { ActivatedRoute, Router } from '@angular/router';

import { User } from '../../user/user';
import { UserService } from '../../user/user.service';

@Component({
    selector: 'app-post-detailed',
    templateUrl: './post-detailed.component.html',
    styleUrls: ['./post-detailed.component.css']
})
export class PostDetailedComponent {
    posts: Post[] = [];
    post: Post = {
        postId: 0,
        userId: 0,
        categoryId: 0,
        title: "",
        content: "",
        viewCount: 0,
        creationDate: "",
        isPublished: false
    };

    editMode: boolean = false;

    users: User[] = [];

    constructor(private postService: PostService, private router: Router, private activatedRoute: ActivatedRoute, private userService: UserService) {
        this.userService.setUsers();
        this.users = this.userService.getUsers();
    }

    ngOnInit() {
        this.activatedRoute.params.subscribe(params => {
            const id = params['id'];
            this.postService.setPosts();
            this.posts = this.postService.getPosts();
            this.post = this.postService.findPostById(id)!;
        })
    }

    handleEditPost() {
        this.editMode = true;
    }

    handleCancelEdit() {
        this.editMode = false;
    }

    handleSaveEdit() {
        const postToEdit = this.posts.find((post) => post.postId === this.post.postId);
        postToEdit!.title = this.post.title;
        postToEdit!.content = this.post.content;
        postToEdit!.categoryId = this.post.categoryId;
        postToEdit!.creationDate = this.post.creationDate;
        this.editMode = false;
    }
}