
import './App.css';
import BookDetails from './bookdetails.js';
import BlogDetails from './blogdetails.js';
import CourseDetails from './coursedetails.js';

function App() {
  return (
    <div>
      <h1 style={{textAlign:'center'}}>Blogger app</h1>

      <div className='content' style={{ display: 'flex', textAlign: 'center', justifyContent: 'center' }}>
        <div className='course' style={{ }}>
          <CourseDetails />
        </div>
        <div className='book' style={{ marginLeft: '40px' }}>
          <BookDetails />
        </div>
        <div className='blog' style={{marginLeft: '40px'  }}>
          <BlogDetails />
        </div>
      </div>
    </div>
  );
}

export default App;
