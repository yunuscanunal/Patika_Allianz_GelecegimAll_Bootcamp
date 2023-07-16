export interface Post {
    postId: number,
    userId: number,
    categoryId: number,
    title: string,
    content: string,
    viewCount: number,
    creationDate: string,
    isPublished: boolean
}