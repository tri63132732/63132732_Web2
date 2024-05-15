const authorListElement = document.getElementById('author-list');
const createAuthorForm = document.getElementById('create-author-form');

createAuthorForm.addEventListener('submit', (e) => {
    e.preventDefault();
    const authorName = document.getElementById('author-name').value;
    const authorAlias = document.getElementById('author-alias').value;
    const authorEmail = document.getElementById('author-email').value;

    fetch('/authors', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ authorName, authorAlias, authorEmail })
    })
   .then(response => response.json())
   .then((author) => {
        const authorListItem = document.createElement('li');
        authorListItem.textContent = `${author.authorName} (${author.authorAlias}) - ${author.authorEmail}`;
        authorListElement.appendChild(authorListItem);
    })
   .catch((error) => {
        console.error(error);
    });
});

fetch('/authors')
   .then(response => response.json())
   .then((authors) => {
        authors.forEach((author) => {
            const authorListItem = document.createElement('li');
            authorListItem.textContent = `${author.authorName} (${author.authorAlias}) - ${author.authorEmail}`;
            authorListElement.appendChild(authorListItem);
        });
    })
   .catch((error) => {
        console.error(error);
    });