import {useEffect, useState} from 'react';
import Post from './Post';

function Posts() {
    const[posts, setPosts] = useState([]);
    const[hasError, setHasError] = useState(false);

    const loadPosts = async () => {
        try {
            const response = await fetch("https://jsonplaceholder.typicode.com/posts");
            const data = await response.json();
            setPosts(data);
        }catch(error) {
            console.error("Error loadig posts:", error);
            setHasError(true);
        }
    };

    useEffect(() => {
        loadPosts();
    }, []);

    if(hasError) {
        return <h3>Error loading posts.</h3>;
    }

    return (
        <div>
            <h1>All Posts</h1>
            {posts.map(post=>(
                <Post key={post.id} title={post.title} body={post.body} />
            ))}
        </div>
    );
}

export default Posts;