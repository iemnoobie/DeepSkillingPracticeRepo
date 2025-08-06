import React from 'react';

function CourseDetails() {
  const courses = [
    { id: 1, course: "Angular", date:"4/5/2021" },
    { id: 2, course: "React", date:"6/3/2021" },
  ];

  return (
    <div>
      <h2>🎓 Course Details</h2>
      {courses.map(c => (
        <div key={c.id}>
        <h2>{c.course}</h2>
        <p>{c.date}</p>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
