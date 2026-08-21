const eyes = document.querySelectorAll(".eye");

document.addEventListener("mousemove", function(event) {

    eyes.forEach(function(eye) {

        const pupil = eye.querySelector(".pupil");

        const eyeRect = eye.getBoundingClientRect();

        const eyeCenterX = eyeRect.left + eyeRect.width / 2;
        const eyeCenterY = eyeRect.top + eyeRect.height / 2;

        const dx = event.clientX - eyeCenterX;
        const dy = event.clientY - eyeCenterY;

        const angle = Math.atan2(dy, dx);

        const distance = 12;

        const pupilX = Math.cos(angle) * distance;
        const pupilY = Math.sin(angle) * distance;

        pupil.style.transform =
            `translate(-50%, -50%) translate(${pupilX}px, ${pupilY}px)`;

    });

});
